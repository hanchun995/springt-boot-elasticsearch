package com.fsyk.es.dao;


import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.fsyk.es.entity.Book;


public interface BookDao extends ElasticsearchRepository<Book,String>{

}