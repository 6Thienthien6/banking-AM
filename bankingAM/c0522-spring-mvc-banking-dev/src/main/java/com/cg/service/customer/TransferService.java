package com.cg.service.customer;

import com.cg.model.Transfer;
import com.cg.service.IGeneralService;

import java.math.BigDecimal;

public interface TransferService extends IGeneralService<Transfer> {
    BigDecimal getSumFeesAmount();

    String doTransfer(Transfer transfer);
}
