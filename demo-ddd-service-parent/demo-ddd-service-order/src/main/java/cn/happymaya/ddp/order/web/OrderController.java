package cn.happymaya.ddp.order.web;

import cn.happymaya.ddp.order.entity.Order;
import cn.happymaya.ddp.support.entity.ResultSet;
import cn.happymaya.ddp.support.web.OrmController;
import cn.happymaya.ddp.support.web.QueryController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrmController controller;
    @Autowired
    private QueryController queryController;

    @PostMapping("create")
    public void createOrder(Map<String, Object> json, HttpServletRequest request) {
        controller.execute("order","createOrder", json, request);
    }

    @PostMapping("modify")
    public void modifyOrder(Map<String, Object> json, HttpServletRequest request) {
        controller.execute("order", "modifyOrder", json, request);
    }

    @PostMapping("delete")
    public void deleteOrder(Map<String, Object> json, HttpServletRequest request) {
        controller.execute("order", "deleteOrder", json, request);
    }

    @GetMapping("check")
    public Order checkOrder(Map<String, Object> json, HttpServletRequest request) {
        return (Order)controller.execute("order", "checkOrder", json, request);
    }

    @GetMapping("list")
    public List<Order> listOfOrders(Map<String, Object> json, HttpServletRequest request) {
        return (List<Order>)controller.execute("order", "listOfOrders", json, request);
    }

    @RequestMapping(value = "query", method = {RequestMethod.GET, RequestMethod.POST})
    public ResultSet query(Map<String, Object> json) {
        return queryController.query("orderQry", json);
    }
}
