package guru.springframework.msscssm.repository;

import guru.springframework.msscssm.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jeffreymzd on 3/25/20
 */
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
