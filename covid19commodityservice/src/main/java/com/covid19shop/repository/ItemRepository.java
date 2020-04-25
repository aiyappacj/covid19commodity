package com.covid19shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.covid19shop.model.Item;

@Repository
@Transactional
public interface ItemRepository extends JpaRepository<Item, Long> {

	Item findByItemid(int itemid);

	void deleteByItemid(int itemid);
	
	List<Item> findByDescription(String description);
}
