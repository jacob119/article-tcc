package ymyoo.stock.entity;

import ymyoo.stock.AdjustmentType;
import ymyoo.stock.Status;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ReservedStock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private AdjustmentType adjustmentType;

    private String productId;

    private Long qty;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    public ReservedStock() {
    }

    public ReservedStock(AdjustmentType adjustmentType, String productId, Long qty) {
        this.adjustmentType = adjustmentType;
        this.productId = productId;
        this.qty = qty;
        this.created = new Date();
    }

    public Long getId() {
        return id;
    }

    public AdjustmentType getAdjustmentType() {
        return adjustmentType;
    }

    public String getProductId() {
        return productId;
    }

    public Long getQty() {
        return qty;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "ReservedStock{" +
                "id=" + id +
                ", adjustmentType=" + adjustmentType +
                ", productId='" + productId + '\'' +
                ", qty=" + qty +
                ", status=" + status +
                ", created=" + created +
                '}';
    }
}

