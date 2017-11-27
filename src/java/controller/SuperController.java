/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ProductoDAO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Miau
 */


@RestController
@RequestMapping("/controller")
public class SuperController {

    @RequestMapping(value = "getDatos", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    String getDatos() {
        ProductoDAO pdao = new ProductoDAO();
        Gson g = new GsonBuilder()
                .disableHtmlEscaping()
                .excludeFieldsWithoutExposeAnnotation().create();
        return g.toJson(pdao.getAll());
    }
}
