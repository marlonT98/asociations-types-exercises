    package com.jpa.relations.unidirectional.one_to_one;

    import jakarta.persistence.*;
    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity(name = "uni_ParkingSport_one_to_one")
    @Table(name = "uni_ParkingSport_one_to_one")
    public class ParkingSpot {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;





















    }
