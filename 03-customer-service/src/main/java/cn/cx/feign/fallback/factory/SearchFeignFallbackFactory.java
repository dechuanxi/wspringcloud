package cn.cx.feign.fallback.factory;

import cn.cx.feign.fallback.SearchFeignFallback;
import feign.hystrix.FallbackFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author WDZ
 * @date 2020/9/14
 * @time 19:42
 * @description
 */
@Component
public class SearchFeignFallbackFactory implements FallbackFactory<SearchFeignFallback> {

    @Autowired
    SearchFeignFallback searchFeignFallback;

    /**
     * 获取目标接口的问题信息
     * @param throwable
     * @return
     */
    @Override
    public SearchFeignFallback create(Throwable throwable) {
        //输出异常堆栈信息
        throwable.printStackTrace();
        return searchFeignFallback;
    }
}
