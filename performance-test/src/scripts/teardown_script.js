import {
    getBody, getPayPosition, payReceipt, getDebtPositions, deleteDebtPosition
} from "./scripts_common.js";

const fiscalCodeEC = process.env.FISCAL_CODE_EC;

//DELETE POSITION
const deletePosition = async () => {

    var dueDateFrom = new Date();
    dueDateFrom.setHours(d.getHours() - 2)

    var responseDebtPosition = await getDebtPositions(fiscalCodeEC, dueDateFrom);

    for(let position of responseDebtPosition?.data?.payment_position_list){
        await deleteDebtPosition(fiscalCodeEC, element.iupd);
    };
};

deletePosition().then((res) => {
    console.log("DELETED TEST POSITIONS");
});