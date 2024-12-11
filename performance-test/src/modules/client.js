import http from 'k6/http';

const subKey = `${__ENV.OCP_APIM_SUBSCRIPTION_KEY}`;

export function getMBD(url, fiscalCode) {

  let headers = {
    'Ocp-Apim-Subscription-Key': subKey,
  };

  return http.get(url + fiscalCode + "/mbd", { headers, responseType: "text"});
}

export function getReceipt(url, fiscalCode,nav) {

  let headers = {
    'Ocp-Apim-Subscription-Key': subKey,
  };

  return http.get(url + fiscalCode + "/receipt" + nav, { headers, responseType: "text"});
}
