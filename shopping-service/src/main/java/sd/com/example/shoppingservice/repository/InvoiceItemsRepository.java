package sd.com.example.shoppingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sd.com.example.shoppingservice.entity.InvoiceItem;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem,Long> {
}