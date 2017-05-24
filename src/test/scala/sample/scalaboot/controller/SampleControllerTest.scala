package sample.scalaboot.controller

import org.hamcrest.Matchers.equalTo
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders

@RunWith(classOf[SpringRunner])
@SpringBootTest
@AutoConfigureMockMvc
class SampleControllerTest {

  @Autowired
  val mvc: MockMvc = null

  @Test
  @throws[Exception]
  def sampleGet_Ok(): Unit =
    mvc.perform(MockMvcRequestBuilders.get("/sample").accept(MediaType.APPLICATION_JSON))
      .andExpect(status.isOk)
      .andExpect(content.string(equalTo("sample")))
}
