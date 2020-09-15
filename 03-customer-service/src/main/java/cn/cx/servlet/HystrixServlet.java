package cn.cx.servlet;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

import javax.servlet.annotation.WebServlet;

/**
 * @author WDZ
 * @date 2020/9/14
 * @time 20:45
 * @description
 */
@WebServlet("/hystrix.stream")
public class HystrixServlet extends HystrixMetricsStreamServlet {
}
