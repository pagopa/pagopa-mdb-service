import {check} from 'k6';
import {getMDB} from './modules/client.js';
import {SharedArray} from 'k6/data';
import {retrieveNoticeItemData} from './modules/common.js';

const varsArray = new SharedArray('vars', function () {
    return JSON.parse(open(`./${__ENV.VARS}`)).environment;
});
export let options = JSON.parse(open(__ENV.TEST_TYPE));

let attachmentUrl = "";

const vars = varsArray[0];
const mbdServiceUri = `${vars.mbdServiceUri}`;
const subKey = `${__ENV.SUBSCRIPTION_KEY}`;
const fiscalCodeEC = `${__ENV.FISCAL_CODE_EC}`;

export default function () {

    let response = getMDB(mbdServiceUri, fiscalCodeEC);

    console.log("Get MBD call, Status " + response.status);

    check(response, {
        'Get MBD status is 200': (response) => response.status === 200,
        'Get MDB content_type is the expected one':
            (response) => response.headers["Content-Type"] === "application/pdf"
    });

}
