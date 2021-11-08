package com.malm.atos.vrental.controller;

import com.malm.atos.vrental.DTO.LicenseTypeDTO;
import com.malm.atos.vrental.service.LicenseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/licensetypes")
public class LicenseTypeController {

    @Autowired
    private LicenseTypeService licenseTypeService;

    @GetMapping(path="/")
    public String view(Model model) {
        model.addAttribute("licensetypes", licenseTypeService.getAll());
        return "licensetypes";
    }

    @GetMapping( value = "/new")
    public String profile(Model model) {
        model.addAttribute("licensetype", new LicenseTypeDTO());
        return "licensetypecreator";
    }

    @PostMapping(value = "/new")
    public ModelAndView save(LicenseTypeDTO licenseType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("licensetypecreator");
        }
        licenseTypeService.save(licenseType);
        return new ModelAndView("redirect:/licensetypes/");
    }

    @GetMapping(path="/delete/{id}")
    public ModelAndView delete(@PathVariable long id) {
        licenseTypeService.delete(id);
        return new ModelAndView("redirect:/licensetypes/");
    }

    @GetMapping(path="/edit/{id}")
    public String editor(@PathVariable long id, Model model) {
        model.addAttribute("licensetype", licenseTypeService.getById(id));
        return "licensetypeeditor";
    }

    @PostMapping(value = "/edit/{id}")
    public ModelAndView put(LicenseTypeDTO licenseType, BindingResult bindingResult, @PathVariable long id) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("licensetypeeditor");
        }
        licenseTypeService.put(licenseType, id);
        return new ModelAndView("redirect:/licensetypes/");
    }
}
