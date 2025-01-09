import http from 'k6/http';

const subKey = `${__ENV.API_SUBSCRIPTION_KEY}`;

export function getMBD(url, fiscalCode, idCIService) {

  var body = {
                "paymentNotices": [
                    {
                        "firstName": "Mario",
                        "lastName": "Rossi",
                        "fiscalCode": "77777777777",
                        "amount": 16,
                        "email": "test@pagopa.it",
                        "province": "RM",
                        "documentHash": "PHJvb3Q+PC9yb290Pg=========================="
                    }
                ],
                "idCIService": idCIService,
                "returnUrls": {
                    "successUrl": "https://url1.it",
                    "cancelUrl": "https://url2.it",
                    "errorUrl": "https://url3.it"
                }
            };

  let headers = {
    'Ocp-Apim-Subscription-Key': subKey,
    "Content-Type": "application/json"
  };

  return http.post(url + "/" + fiscalCode + "/mbd", JSON.stringify(body), { headers});
}

export function getReceipt(url, fiscalCode,nav) {

  let headers = {
    'Ocp-Apim-Subscription-Key': subKey,
  };

  return http.get(url + "/" + fiscalCode + "/receipt/" + nav, { headers, responseType: "text"});
}
