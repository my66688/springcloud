package springcloud.service;

import springcloud.dao.PaymentDao;
import entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImple implements PaymentService {
    @Autowired
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return paymentDao.queryById(id);
    }
}
