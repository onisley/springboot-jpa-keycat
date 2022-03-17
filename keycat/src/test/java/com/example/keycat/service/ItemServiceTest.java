package com.example.keycat.service;

import com.example.keycat.domain.item.Item;
import com.example.keycat.domain.item.KeyCap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ItemServiceTest {

    @Autowired
    ItemService itemService;

    @Test
    public void testSaveItem_성공() throws Exception {
        // given
        Item item = new KeyCap();
        item.setName("레인보우 키캡");

        // when
        Long savedId = itemService.saveItem(item);

        // then
        assertEquals(item, itemService.findOne(savedId));
    }

}