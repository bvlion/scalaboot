package sample.scalaboot.controller

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

@RestController
@RequestMapping(Array("/sample"))
class SampleController {
  @RequestMapping(method = Array(RequestMethod.GET))
  def sample = "sample"
}
