package cc._9d77v.web.lib;


import cc._9d77v.web.dto.vo.SampleVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class R<T> {
    @ApiModelProperty("状态码")
    private int code;
    @ApiModelProperty("提示信息")
    private String message;
    @ApiModelProperty("数据")
    private T data;

    public static <T> R<T> success(T data) {
        R<T> r = new R<>();
        r.setCode(REnum.SUCCESS.getCode());
        r.setMessage(REnum.SUCCESS.getMessage());
        r.setData(data);
        return r;
    }

    public static <T> R<T> error(int code, String message) {
        return new R(code, message, null);
    }
}
