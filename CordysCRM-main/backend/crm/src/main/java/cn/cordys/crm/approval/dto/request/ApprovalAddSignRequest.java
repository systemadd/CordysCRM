package cn.cordys.crm.approval.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
public class ApprovalAddSignRequest extends ApprovalOperationBaseRequest{


    @Schema(description = "加签方式 before: 在我之前，after: 在我之后")
    private String type;

    @Schema(description = "加签意见")
    private String comment;

    @Schema(description = "加签意见的附件集合")
    private List<String> attachmentIds;
}
