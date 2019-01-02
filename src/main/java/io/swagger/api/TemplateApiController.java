package io.swagger.api;

import io.swagger.model.Template;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.service.TemplateService;
import io.swagger.utils.CommonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-26T14:48:53.126Z")

@Controller
public class TemplateApiController implements TemplateApi {

    private static final Logger log = LoggerFactory.getLogger(TemplateApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TemplateApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @Autowired
    private TemplateService templateService;

    public ResponseEntity<Object> addtemplate(@ApiParam(value = "template object that needs to be added to the store" ,required=true )  @Valid @RequestBody Template body) {

        return ResponseEntity.ok(templateService.insert(CommonUtils.convertTemplateToTemplateEntity(body)));
    }

    public ResponseEntity<Object> findById(@ApiParam(value = "find a template by id",required=true) @PathVariable("id") Integer id) {
        return ResponseEntity.ok(templateService.findById(id));
    }

    public ResponseEntity<Object> findtemplatesByStatus(@NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true, allowableValues = "available, pending, sold") @Valid @RequestParam(value = "status", required = true) List<String> status) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("\"{}\"", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> updatetemplate(@ApiParam(value = "template object that needs to be added to the store" ,required=true )  @Valid @RequestBody Template body) {
        return ResponseEntity.ok(templateService.update(CommonUtils.convertTemplateToTemplateEntity(body)));
    }

}
