package it.gov.pagopa.mbd.service.model.mdb;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Valid
public class GetMdbRequest {

    @Size(min = 1, max = 1)
    @Valid
    private List<PaymentNotice> paymentNotices;
    @NotBlank
    private String idCIService;
    @NotNull
    @Valid
    private ReturnUrls returnUrls;

}
