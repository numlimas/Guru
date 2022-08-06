package com.guru.demo.steps;

import com.guru.demo.utils.Scroll;
import net.thucydides.core.annotations.Step;
import com.guru.demo.pageObjects.RegistroPages;

public class RegistrarSteps extends MetodosSeleniumSteps {

    RegistroPages registroPages = new RegistroPages();
    Scroll scroll = new Scroll();

    @Step
    public void escribirForm(){
        clickear(registroPages.getBtnRegister());
        escribir(registroPages.getTxtFirst(),"Homer");
        escribir(registroPages.getTxtLast(),"Simpson");
        escribir(registroPages.getTxtPhone(),"55555");
        escribir(registroPages.getTxtEmail(),"homerduft@hotmal.com");
        escribir(registroPages.getTxtAdress(),"Av. siempre viva");
        escribir(registroPages.getTxtCity(),"Cucuta");
        escribir(registroPages.getTxtState(),"NdS");
        escribir(registroPages.getTxtPostal(),"540000");
        seleccionar(registroPages.getTxtCountry(),"COLOMBIA");
        escribir(registroPages.getTxtUsername(),"homerbeer");
        escribir(registroPages.getTxtPassword(),"H12345");
        escribir(registroPages.getTxtConfPass(),"H12345");
        scroll.scrollAElemento(registroPages.getBtnEnviar());
        clickear(registroPages.getBtnEnviar());
    }

}
