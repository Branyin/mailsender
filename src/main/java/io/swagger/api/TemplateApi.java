/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.1-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Template;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-26T14:48:53.126Z")

@Api(value = "template", description = "the template API")
public interface TemplateApi {

    @ApiOperation(value = "Add a new template", nickname = "addtemplate", notes = "", authorizations = {
        @Authorization(value = "templatestore_auth", scopes = {
            @AuthorizationScope(scope = "write:templates", description = "modify templates in your account"),
            @AuthorizationScope(scope = "read:templates", description = "read your templates")
            })
    }, tags={ "template", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/template",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addtemplate(@ApiParam(value = "template object that needs to be added to the store" ,required=true )  @Valid @RequestBody Template body);


    @ApiOperation(value = "Finds templates by status", nickname = "findById", notes = "findById", response = Object.class, tags={ "template", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    @RequestMapping(value = "/template/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Object> findById(@ApiParam(value = "find a template by id",required=true) @PathVariable("id") Integer id);


    @ApiOperation(value = "Finds templates by status", nickname = "findtemplatesByStatus", notes = "Multiple status values can be provided with comma separated strings", response = Object.class, authorizations = {
        @Authorization(value = "templatestore_auth", scopes = {
            @AuthorizationScope(scope = "write:templates", description = "modify templates in your account"),
            @AuthorizationScope(scope = "read:templates", description = "read your templates")
            })
    }, tags={ "template", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class),
        @ApiResponse(code = 400, message = "Invalid status value") })
    @RequestMapping(value = "/template/findByStatus",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Object> findtemplatesByStatus(@NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true, allowableValues = "available, pending, sold") @Valid @RequestParam(value = "status", required = true) List<String> status);


    @ApiOperation(value = "Update an existing template", nickname = "updatetemplate", notes = "", authorizations = {
        @Authorization(value = "templatestore_auth", scopes = {
            @AuthorizationScope(scope = "write:templates", description = "modify templates in your account"),
            @AuthorizationScope(scope = "read:templates", description = "read your templates")
            })
    }, tags={ "template", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "template not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/template",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updatetemplate(@ApiParam(value = "template object that needs to be added to the store" ,required=true )  @Valid @RequestBody Template body);

}
