package com.weke.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.weke.provider.service.DirectionsService;
import com.weke.provider.vo.DirectionDetail;
import com.weke.provider.vo.DirectionDetailsVo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("direction")
@CrossOrigin
public class DirectionController {

    @Reference
    private DirectionsService directionService;

    @PostMapping("info")
    public DirectionDetailsVo getDirectionInfo(@RequestBody DirectionDetail directionDetail) {
        //System.out.println("dire="+directionDetail.getDire());
        DirectionDetailsVo directionDetailsVo = directionService.getDirectionDetails(directionDetail.getDire(),directionDetail.getKind(),directionDetail.getDiff());
        //System.out.println(directionDetailsVo);
        return directionDetailsVo;
    }
}
