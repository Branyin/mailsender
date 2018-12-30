package io.swagger.service;

import io.swagger.entity.TemplateEntity;

import java.awt.print.Pageable;
import java.util.List;

public interface TemplateService {
    TemplateEntity insert(TemplateEntity templateEntity);
    TemplateEntity update(TemplateEntity templateEntity);
    TemplateEntity findById(Integer id);
}
