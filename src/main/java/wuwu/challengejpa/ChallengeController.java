package wuwu.challengejpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChallengeController {

    @Autowired
    private ChallengeTestRepository challengeTestRepository;

    @PostMapping("/challenges")
    public String insert(@RequestBody ChallengeTest challengeTest){
        //create data base on FE
        challengeTestRepository.save(challengeTest);
        return "BD Create";
    }
    @PutMapping("/challenges/{challengeId}")
    public String update(@PathVariable Integer challengeId,
                         @RequestBody ChallengeTest challengeTest){
        //from option type to challenge type
        ChallengeTest c = challengeTestRepository.findById(challengeId).orElse(null);

        if (c!=null){
            //modify specific
            c.setFarmnm_ch(challengeTest.getFarmnm_ch());
            challengeTestRepository.save(c);
            return "DB Update";
        }else{
            return "Update fail, no this data";
        }

        //check if exist before update
//        challengeTest.setId(challengeId);
//        challengeTestRepository.save(challengeTest);

    }
    @DeleteMapping("/challenges/{challengeId}")
    public String delete(@PathVariable Integer challengeId){
        challengeTestRepository.deleteById(challengeId);
        return "DB delete";
    }
    @GetMapping("/challenges/{challengeId}")
    public ChallengeTest read(@PathVariable Integer challengeId){
        ChallengeTest challengeTest = challengeTestRepository.findById(challengeId).orElse(null);
        return challengeTest;
    }
}
