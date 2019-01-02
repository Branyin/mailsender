package io.swagger.service.Impl;

import io.swagger.entity.TemplateEntity;
import io.swagger.repository.TemplateRepository;
import io.swagger.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemplateImpl implements TemplateService {
    @Autowired
    TemplateRepository templateRepository;

    @Override
    public TemplateEntity insert(TemplateEntity templateEntity) {
        return templateRepository.save(templateEntity);
    }

    @Override
    public TemplateEntity update(TemplateEntity templateEntity) {
        return templateRepository.save(templateEntity);
    }

    @Override
    public TemplateEntity findById(Integer id) {
        return templateRepository.findOne(id);
    }

}
