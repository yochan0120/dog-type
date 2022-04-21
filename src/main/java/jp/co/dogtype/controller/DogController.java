package jp.co.dogtype.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.dogtype.entity.Dog;

@Controller
public class DogController {

	@RequestMapping("/list")
	public String list(Model model) {
		List<Dog> dogs = new ArrayList<Dog>();

		Dog chihuahua = new Dog(1, "チワワ", "メキシコ", "世界一小さい");
		Dog toyPoodle = new Dog(2, "トイプードル", "フランス", "日本で一番人気がある");
		Dog dachshund = new Dog(3, "ダックスフンド", "ドイツ", "胴が長い");

		dogs.add(chihuahua);
		dogs.add(toyPoodle);
		dogs.add(dachshund);

		model.addAttribute("dogs", dogs); // Tymeleafに渡す

		return "list";
	}

}