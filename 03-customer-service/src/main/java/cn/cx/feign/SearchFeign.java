package cn.cx.feign;

import cn.cx.feign.fallback.SearchFeignFallback;
import cn.cx.feign.fallback.factory.SearchFeignFallbackFactory;
import cn.cx.pojo.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author WDZ
 * @date 2020/9/14
 * @time 17:58
 * @description
 */
//@FeignClient(value = "SEARCH-SERVICE", fallback = SearchFeignFallback.class)
@FeignClient(value = "SEARCH-SERVICE", fallbackFactory= SearchFeignFallbackFactory.class)
public interface SearchFeign {

    /**
     * 将来，这个方法被调用时，会通过动态代理生成代理对象去调用真正目标对象
     * 在映射时，需要把value属性加上
     * @return
     */
    @RequestMapping(value = "/search/test")
    String test();

    @GetMapping("/search/{id}")
    Customer findById(@PathVariable Integer id);


    @GetMapping("/search/get")
    Customer get(@RequestParam(value = "id") Integer id,
                 @RequestParam(value = "name") String name,
                 @RequestParam(value = "age") Integer age);

    @PostMapping("/search/save")
    Customer save(@RequestBody Customer customer);

}
