package rh.model;

public enum Cargo {

    ASSISTENTE {
        @Override
        public Cargo promover() {
            return ANALISTA;
        }
    },
    ANALISTA {
        @Override
        public Cargo promover() {
            return ESPECIALISTA;
        }
    },
    ESPECIALISTA {
        @Override
        public Cargo promover() {
            return GERENTE;
        }
    },
    GERENTE {
        @Override
        public Cargo promover() {
            return GERENTE;
        }
    };

    public abstract Cargo promover();
}
