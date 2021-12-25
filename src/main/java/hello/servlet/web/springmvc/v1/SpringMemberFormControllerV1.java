package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller//@Component를 포함하고 있어 자동으로 인식되어 등록됨(Component Scan) 아래 두 줄과 동치
//@Component
//@RequestMapping
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process(){
        return new ModelAndView("new-form");
    }


}
