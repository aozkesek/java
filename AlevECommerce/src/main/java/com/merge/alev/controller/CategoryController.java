package com.merge.alev.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.merge.alev.dao.model.Category;

@RestController
public class CategoryController extends GenericCRUDController<Category> {
	
	@Override
	@RequestMapping("/category/create")
	@ResponseBody
	public GenericResponse<Category> create(@RequestBody GenericRequest<Category> request) {
		return super.create(request);
	}

	@Override
	@RequestMapping("/category/read")
	@ResponseBody
	public GenericResponse<Category> read(@RequestBody GenericRequest<Category> request) {
		return super.read(request);
	}

	@Override
	@RequestMapping("/category/update")
	@ResponseBody
	public GenericResponse<Category> update(@RequestBody GenericRequest<Category> request) {
		return super.update(request);
	}

	@Override
	@RequestMapping("/category/delete")
	@ResponseBody
	public GenericResponse<Category> delete(@RequestBody GenericRequest<Category> request) {
		return super.delete(request);
	}	
	
	@Override
	@RequestMapping("/category/list")
	@ResponseBody
	public GenericResponse<Category> list(@RequestBody GenericRequest<Category> request) {
		return super.list(request);
	}	
	
}
