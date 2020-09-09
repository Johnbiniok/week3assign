package wctc.edu.week3assignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/learn")
public class TeachController {

        @RequestMapping("/exchange")
        public String showExchangeInfo() {
            return "pages/find-exchange";
        }

        @RequestMapping("/bank")
        public String showBankInfo() {
            return "pages/link-bank-account";
        }

        @RequestMapping("/investment")
        public String showInvestInfo() {
            return "pages/investment-options";
        }

        @RequestMapping("/more")
        public String showMoreInfo() { return "pages/learn-more"; }

}
