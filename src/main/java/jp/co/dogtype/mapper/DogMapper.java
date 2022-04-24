package jp.co.dogtype.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.dogtype.entity.Dog;

@Mapper
public interface DogMapper {

	public List<Dog> selectAll();
}