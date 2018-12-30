package io.swagger.utils;

import io.swagger.entity.TemplateEntity;
import io.swagger.model.Template;
import org.springframework.beans.BeanUtils;

import java.security.PublicKey;

public class CommonUtils {
    public static TemplateEntity convertTemplateToTemplateEntity(Template template){
        TemplateEntity templateEntity = new TemplateEntity();
        BeanUtils.copyProperties(template,templateEntity);
        return templateEntity;
    }

    public static Template convertTemplateEntityToTemplate(TemplateEntity templateEntity){
        Template template = new Template();
        BeanUtils.copyProperties(templateEntity,template);
        return template;
    }


}

