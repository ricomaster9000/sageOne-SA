/**
 Licensed to the Apache Software Foundation (ASF) under one
 or more contributor license agreements.  See the NOTICE file
 distributed with this work for additional information
 regarding copyright ownership.  The ASF licenses this file
 to you under the Apache License, Version 2.0 (the
 "License"); you may not use this file except in compliance
 with the License.  You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing,
 software distributed under the License is distributed on an
 "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 KIND, either express or implied.  See the License for the
 specific language governing permissions and limitations
 under the License.
 **/
package SageOneIntegration.SA.V1_1_2.SageOneApiEntities;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Date;

/**
 * Created by brent on 2017/05/31.
 */
@JsonDeserialize(builder = SageOneSupplierReturn.Builder.class)
public final class SageOneSupplierReturn {
    private final Integer ID;
    private final String FromDocument;
    private final Boolean Locked;
    private final Integer SupplierId;
    private final String SupplierName;
    private final SageOneSupplier Supplier;
    private final Date Modified;
    private final Date Created;
    private final Integer StatusId;
    private final Date Date;
    private final Boolean Inclusive;
    private final Double DiscountPercentage;
    //String length: inclusive between 0 and 30
    private final String TaxReference;
    //String length: inclusive between 0 and 100
    private final String DocumentNumber;
    //String length: inclusive between 0 and 100
    private final String Reference;
    //String length: inclusive between 0 and 8000
    private final String Message;
    private final Double Discount;
    private final Double Exclusive;
    private final Double Tax;
    private final Double Rounding;
    private final Double Total;
    private final Double AmountDue;
    //String length: inclusive between 0 and 100
    private final String PostalAddress01;
    private final String PostalAddress02;
    private final String PostalAddress03;
    private final String PostalAddress04;
    private final String PostalAddress05;
    private final String DeliveryAddress01;
    private final String DeliveryAddress02;
    private final String DeliveryAddress03;
    private final String DeliveryAddress04;
    private final String DeliveryAddress05;
    private final Boolean Printed;
    //----------------------------------------
    private final Integer CurrencyId;
    private final Double ExchangeRate;
    private final Integer TaxPeriodId;
    private final Boolean Editable;
    private final Boolean HasAttachments;
    private final Boolean HasNotes;
    private final Boolean HasAnticipatedDate;
    private final Date AnticipatedDate;
    //String length: inclusive between 0 and 100
    private final String ExternalReference;
    private final SageOneCommercialDocumentLine[] Lines;

    public SageOneSupplierReturn(Builder builder) {
        ID = builder.ID;
        FromDocument = builder.FromDocument;
        Locked = builder.Locked;
        SupplierId = builder.SupplierId;
        SupplierName = builder.SupplierName;
        Supplier = builder.Supplier;
        Modified = builder.Modified;
        Created = builder.Created;
        StatusId = builder.StatusId;
        Date = builder.Date;
        Inclusive = builder.Inclusive;
        DiscountPercentage = builder.DiscountPercentage;
        TaxReference = builder.TaxReference;
        DocumentNumber = builder.DocumentNumber;
        Reference = builder.Reference;
        Message = builder.Message;
        Discount = builder.Discount;
        Exclusive = builder.Exclusive;
        Tax = builder.Tax;
        Rounding = builder.Rounding;
        Total = builder.Total;
        AmountDue = builder.AmountDue;
        PostalAddress01 = builder.PostalAddress01;
        PostalAddress02 = builder.PostalAddress02;
        PostalAddress03 = builder.PostalAddress03;
        PostalAddress04 = builder.PostalAddress04;
        PostalAddress05 = builder.PostalAddress05;
        DeliveryAddress01 = builder.DeliveryAddress01;
        DeliveryAddress02 = builder.DeliveryAddress02;
        DeliveryAddress03 = builder.DeliveryAddress03;
        DeliveryAddress04 = builder.DeliveryAddress04;
        DeliveryAddress05 = builder.DeliveryAddress05;
        Printed = builder.Printed;
        CurrencyId = builder.CurrencyId;
        ExchangeRate = builder.ExchangeRate;
        TaxPeriodId = builder.TaxPeriodId;
        Editable = builder.Editable;
        HasAttachments = builder.HasAttachments;
        HasNotes = builder.HasNotes;
        HasAnticipatedDate = builder.HasAnticipatedDate;
        AnticipatedDate = builder.AnticipatedDate;
        ExternalReference = builder.ExternalReference;
        Lines = builder.Lines;
    }

    public static class Builder {
        private Integer ID;
        private String FromDocument;
        private Boolean Locked;
        private Integer SupplierId;
        private String SupplierName;
        private SageOneSupplier Supplier;
        private Date Modified;
        private Date Created;
        private Integer StatusId;
        private Date Date;
        private Boolean Inclusive;
        private Double DiscountPercentage;
        private String TaxReference;
        private String DocumentNumber;
        private String Reference;
        private String Message;
        private Double Discount;
        private Double Exclusive;
        private Double Tax;
        private Double Rounding;
        private Double Total;
        private Double AmountDue;
        private String PostalAddress01;
        private String PostalAddress02;
        private String PostalAddress03;
        private String PostalAddress04;
        private String PostalAddress05;
        private String DeliveryAddress01;
        private String DeliveryAddress02;
        private String DeliveryAddress03;
        private String DeliveryAddress04;
        private String DeliveryAddress05;
        private Boolean Printed;
        private Integer CurrencyId;
        private Double ExchangeRate;
        private Integer TaxPeriodId;
        private Boolean Editable;
        private Boolean HasAttachments;
        private Boolean HasNotes;
        private Boolean HasAnticipatedDate;
        private Date AnticipatedDate;
        private String ExternalReference;
        private SageOneCommercialDocumentLine[] Lines;

        public Builder withId(final Integer val){
            ID = val;
            return this;
        }

        public Builder withFromDocument(final String val){
            FromDocument = val;
            return this;
        }

        public Builder withLocked(final Boolean val){
            Locked = val;
            return this;
        }

        public Builder withSupplierId(final Integer val){
            SupplierId = val;
            return this;
        }

        public Builder withSupplierName(final String val){
            SupplierName = val;
            return this;
        }

        public Builder withSupplier(final SageOneSupplier val){
            Supplier = val;
            return this;
        }

        public Builder withModified(final Date val){
            Modified = val;
            return this;
        }


        public Builder withCreated(final Date val){
            Created = val;
            return this;
        }

        public Builder withStatusId(final Integer val){
            StatusId = val;
            return this;
        }

        public Builder withDate(final Date val){
            Date = val;
            return this;
        }

        public Builder withInclusive(final Boolean val){
            Inclusive = val;
            return this;
        }

        public Builder withDiscountPercentage(final Double val){
            DiscountPercentage = val;
            return this;
        }

        public Builder withTaxReference(final String val){
            TaxReference = val;
            return this;
        }

        public Builder withDocumentNumber(final String val){
            DocumentNumber = val;
            return this;
        }

        public Builder withReference(final String val){
            Reference = val;
            return this;
        }

        public Builder withMessage(final String val){
            Message = val;
            return this;
        }

        public Builder withDiscount(final Double val){
            Discount = val;
            return this;
        }

        public Builder withExclusive(final Double val){
            Exclusive = val;
            return this;
        }

        public Builder withTax(final Double val){
            Tax = val;
            return this;
        }

        public Builder withRounding(final Double val){
            Rounding = val;
            return this;
        }

        public Builder withTotal(final Double val){
            Total = val;
            return this;
        }

        public Builder withAmountDue(final Double val){
            AmountDue = val;
            return this;
        }

        public Builder withPostalAddress01(final String val){
            PostalAddress01 = val;
            return this;
        }

        public Builder withPostalAddress02(final String val){
            PostalAddress02 = val;
            return this;
        }

        public Builder withPostalAddress03(final String val){
            PostalAddress03 = val;
            return this;
        }

        public Builder withPostalAddress04(final String val){
            PostalAddress04 = val;
            return this;
        }

        public Builder withPostalAddress05(final String val){
            PostalAddress05 = val;
            return this;
        }

        public Builder withDeliveryAddress01(final String val){
            DeliveryAddress01 = val;
            return this;
        }

        public Builder withDeliveryAddress02(final String val){
            DeliveryAddress02 = val;
            return this;
        }

        public Builder withDeliveryAddress03(final String val){
            DeliveryAddress03 = val;
            return this;
        }

        public Builder withDeliveryAddress04(final String val){
            DeliveryAddress04 = val;
            return this;
        }

        public Builder withDeliveryAddress05(final String val){
            DeliveryAddress05 = val;
            return this;
        }

        public Builder withPrinted(final Boolean Printed) {
            this.Printed = Printed;
            return this;
        }

        public Builder withCurrencyId(final Integer val){
            CurrencyId = val;
            return this;
        }

        public Builder withExchangeRate(final Double val){
            ExchangeRate = val;
            return this;
        }

        public Builder withTaxPeriodId(final Integer val){
            TaxPeriodId = val;
            return this;
        }

        public Builder withEditable(final Boolean val){
            Editable = val;
            return this;
        }

        public Builder withHasAttachments(final Boolean val){
            HasAttachments = val;
            return this;
        }

        public Builder withHasNotes(final Boolean val){
            HasNotes = val;
            return this;
        }

        public Builder withHasAnticipatedDate(final Boolean val){
            HasAnticipatedDate = val;
            return this;
        }

        public Builder withAnticipatedDate(final Date val){
            AnticipatedDate = val;
            return this;
        }

        public Builder withExternalReference(final String val){
            ExternalReference = val;
            return this;
        }

        public Builder withLines(final SageOneCommercialDocumentLine[] val){
            Lines = val;
            return this;
        }

        public SageOneSupplierReturn build(){
            return new SageOneSupplierReturn(this);
        }
    }

    public Integer getId() {
        return ID;
    }

    public String getFromDocument() {
        return FromDocument;
    }

    public Boolean isLocked() {
        return Locked;
    }

    public Integer getSupplierId() {
        return SupplierId;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public SageOneSupplier getSupplier() {
        return Supplier;
    }

    public Date getModified() {
        return Modified;
    }

    public Date getCreated() {
        return Created;
    }

    public Integer getStatusId() {
        return StatusId;
    }

    public Date getDate() {
        return Date;
    }

    public Boolean isInclusive() {
        return Inclusive;
    }

    public Double getDiscountPercentage() {
        return DiscountPercentage;
    }

    public String getTaxReference() {
        return TaxReference;
    }

    public String getDocumentNumber() {
        return DocumentNumber;
    }

    public String getReference() {
        return Reference;
    }

    public String getMessage() {
        return Message;
    }

    public Double getDiscount() {
        return Discount;
    }

    public Double getExclusive() {
        return Exclusive;
    }

    public Double getTax() {
        return Tax;
    }

    public Double getRounding() {
        return Rounding;
    }

    public Double getTotal() {
        return Total;
    }

    public Double getAmountDue() {
        return AmountDue;
    }

    public String getPostalAddress01() {
        return PostalAddress01;
    }

    public String getPostalAddress02() {
        return PostalAddress02;
    }

    public String getPostalAddress03() {
        return PostalAddress03;
    }

    public String getPostalAddress04() {
        return PostalAddress04;
    }

    public String getPostalAddress05() {
        return PostalAddress05;
    }

    public String getDeliveryAddress01() {
        return DeliveryAddress01;
    }

    public String getDeliveryAddress02() {
        return DeliveryAddress02;
    }

    public String getDeliveryAddress03() {
        return DeliveryAddress03;
    }

    public String getDeliveryAddress04() {
        return DeliveryAddress04;
    }

    public String getDeliveryAddress05() {
        return DeliveryAddress05;
    }

    public Boolean getPrinted() {
        return Printed;
    }

    public Integer getCurrencyId() {
        return CurrencyId;
    }

    public Double getExchangeRate() {
        return ExchangeRate;
    }

    public Integer getTaxPeriodId() {
        return TaxPeriodId;
    }

    public Boolean isEditable() {
        return Editable;
    }

    public Boolean isHasAttachments() {
        return HasAttachments;
    }

    public Boolean isHasNotes() {
        return HasNotes;
    }

    public Boolean isHasAnticipatedDate() {
        return HasAnticipatedDate;
    }

    public Date getAnticipatedDate() {
        return AnticipatedDate;
    }

    public String getExternalReference() {
        return ExternalReference;
    }

    public SageOneCommercialDocumentLine[] getLines() {
        return Lines;
    }
}
