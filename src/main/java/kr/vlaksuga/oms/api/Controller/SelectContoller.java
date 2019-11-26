package kr.vlaksuga.oms.api.Controller;

import kr.vlaksuga.oms.api.CResult;
import kr.vlaksuga.oms.api.mapper.FaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/s")
public class SelectContoller  extends Controller{
    @Autowired
    FaMapper mapper;


    @RequestMapping(value = "/s.*", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    @CrossOrigin(origins="*")
    public CResult s() {
        CResult ret= new CResult();
        ret.putAll(mapper.getNow());
        return ret;
    }


}
