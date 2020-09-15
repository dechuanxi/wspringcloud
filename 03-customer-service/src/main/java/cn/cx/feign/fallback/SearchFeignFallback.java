package cn.cx.feign.fallback;

import cn.cx.feign.SearchFeign;
import cn.cx.pojo.Customer;
import org.springframework.stereotype.Component;

/**
 * @author WDZ
 * @date 2020/9/14
 * @time 19:30
 * @description
 */
@Component
public class SearchFeignFallback implements SearchFeign {
    @Override
    public String test() {
        return "feign的服务降级成功了";
    }

    @Override
    public Customer findById(Integer id) {
        return null;
    }

    @Override
    public Customer get(Integer id, String name, Integer age) {
        return null;
    }

    @Override
    public Customer save(Customer customer) {
        return null;
    }
}
