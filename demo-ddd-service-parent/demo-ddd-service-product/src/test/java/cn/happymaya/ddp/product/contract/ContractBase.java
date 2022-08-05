package cn.happymaya.ddp.product.contract;

import cn.happymaya.ddp.product.ProductApplication;
import cn.happymaya.ddp.support.web.OrmController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author superhsc
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= ProductApplication.class)
public class ContractBase {

    @Autowired
    private OrmController controller;

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(controller);
    }
}
