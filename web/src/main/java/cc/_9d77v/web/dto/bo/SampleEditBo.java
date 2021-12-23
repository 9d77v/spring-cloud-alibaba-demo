package cc._9d77v.web.dto.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("示例更新")
public class SampleEditBo {
    @ApiModelProperty(value = "主键",required = true,example = "1")
    private  Integer id;
    @ApiModelProperty(value = "名称",required = true,example = "9d77v")
    private String name;
}
