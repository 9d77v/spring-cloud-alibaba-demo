package cc._9d77v.web.controller;

import Service.IHelloService;
import cc._9d77v.web.dto.bo.SampleAddBo;
import cc._9d77v.web.dto.bo.SampleEditBo;
import cc._9d77v.web.dto.vo.SampleVo;
import cc._9d77v.web.lib.Constants;
import cc._9d77v.web.lib.L;
import cc._9d77v.web.lib.R;
import com.alibaba.dubbo.config.annotation.Reference;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Api(value = "/hello", tags = "Hello 控制器")
@RestController
@RefreshScope
public class HelloController {

    @Reference
    private IHelloService helloService;

    @Value("${product}")
    private String product;

    private List<SampleVo> data = new ArrayList<>();

    @ApiOperation(value = "你好")
    @GetMapping("/hello")
    public String Hello() {
        return String.format("hello %s!", product);
    }

    @ApiOperation(value = "应用信息")
    @GetMapping("/appInfo")
    public String AppInfo() {
        return Constants.getInstance().getAppInfo();
    }


    @ApiOperation(value = "add请求")
    @PostMapping("/sample")
    public R<Integer> Add(@RequestBody SampleAddBo req) {
        data.add(new SampleVo(data.size() + 1, req.getName()));
        return R.success(data.size());
    }

    @ApiOperation(value = "edit请求")
    @PutMapping("/sample")
    public R<Integer> Edit(@RequestBody SampleEditBo req) {
        if (data.size() == 0 || req.getId() > data.size()) {
            return R.error(404, "数据不存在");
        }
        data.get(req.getId().intValue() - 1).setName(req.getName());
        return R.success(req.getId());
    }

    @ApiOperation(value = "get请求")
    @GetMapping("/sample/{id}")
    public R<SampleVo> Get(@PathVariable(value = "id") Integer id) {
        if (data.size() == 0 || id > data.size()) {
            return R.error(404, "数据不存在");
        }
        return R.success(data.get(id - 1));
    }

    @ApiOperation(value = "list请求")
    @GetMapping("/sample")
    public R<L<SampleVo>> List() {
        return R.success(new L(data.size(), data));
    }
}

