import {check} from 'k6';
import {getReceipt} from './modules/client.js';
import {SharedArray} from 'k6/data';

const varsArray = new SharedArray('vars', function () {
    return JSON.parse(open(`./${__ENV.VARS}`)).environment;
});
export let options = JSON.parse(open(__ENV.TEST_TYPE));

let attachmentUrl = "";

const vars = varsArray[0];
const mbdServiceUri = `${vars.mbdServiceUri}`;
const subKey = `${__ENV.SUBSCRIPTION_KEY}`;
const fiscalCodeEC = `${vars.fiscalCodeEC}`;
const nav = `${vars.nav}`;

export default function () {

    let response = getReceipt(mbdServiceUri, fiscalCodeEC, nav);

    console.log("Get MBD Receipt call, Status " + response.status);

    check(response, {
        'Get MBD Receipt status is 200': (response) => response.status === 200,
        'Get MDB Receipt content_type is the expected one':
            (response) => response.headers["Content-Type"] === "application/xml"
    });

}
