package cc._9d77v.web.dto.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("示例")
public class SampleVo {
    @ApiModelProperty("主键")
    private Integer id;
    @ApiModelProperty("名称")
    private String name;
}
