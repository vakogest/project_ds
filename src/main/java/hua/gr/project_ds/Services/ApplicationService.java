package hua.gr.project_ds.Services;

import hua.gr.project_ds.Entities.Application;
import hua.gr.project_ds.Repositories.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.Collections;
import java.util.List;

@Service
public class ApplicationService {

    private ApplicationRepository applicationRepository;

    @Autowired
    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    // get all the applications
    public List<Application> getApplications() {
        return applicationRepository.findAll();
    }

    // get all applications that need to be validated by OAED
    public List<Application> getApplicationsOAED() {
        return applicationRepository.findAllById(Collections.singleton(0));
    }

    // get all applications that need to be confirmed by OASA
    public List<Application> getApplicationsOASA() {
        return applicationRepository.findAllById(Collections.singleton(1));
    }

    // get an application by id
    public Application getApplication(int id) {
        return  applicationRepository.getById(id);
    }

    // save an application
    public void saveApplication(Application application) {
        applicationRepository.saveAndFlush(application);
    }

    // remove an application
    public void removeApplication(Application application) {
        applicationRepository.delete(application);
    }

    // remove application by id
    public void removeApplicationById(int id) {
        applicationRepository.deleteById(id);
    }
}

