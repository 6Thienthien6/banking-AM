package com.cg.service.customer;

import com.cg.model.Customer;
import com.cg.service.IGeneralService;

import java.util.List;

public interface CustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByDeletedIsFalse();

    List<Customer> findByIdIsNot (Long id);
}
