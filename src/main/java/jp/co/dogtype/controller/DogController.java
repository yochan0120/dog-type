package jp.co.dogtype.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.dogtype.entity.Dog;

@Controller
public class DogController {

	@RequestMapping("/list")
	public String list() {
		List<Dog> result = new ArrayList<Dog>();

		return "list";
	}

}