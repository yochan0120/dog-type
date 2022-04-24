package jp.co.dogtype.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.dogtype.entity.Dog;
import jp.co.dogtype.mapper.DogMapper;

@Service
public class DogService {

	@Autowired
	DogMapper mapper;

	public List<Dog> getDogList() {
		return mapper.selectAll();
	}

}