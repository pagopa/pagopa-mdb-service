package it.gov.pagopa.mbd.service.model.mdb;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Valid
public class GetMdbReceipt {

    private byte[] content;

}
