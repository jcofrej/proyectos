package Modelo;

import java.util.Date;

public class ProductosExcel {
         String CodProv;
         String CodCli;
         String CodSeg;
         String FechaIngreso;
         String CodArt;
         String Lote;
         String Descripcion;
         int Cantidad;
         String FechaVencimiento;
         String Ubicacion;
         String Observacion;
    
    private ProductosExcel(String _CodProv,String _CodCli,String _CodSeg, String _CodArt, String _FechaIngreso, String _Descripcion, int _Cantidad, String _Lote, String _FechaVencimiento,String _Ubicacion,String _Observacion) {
            CodProv = _CodProv;
            CodCli =_CodCli;
            CodArt = _CodArt;
            FechaIngreso = _FechaIngreso;            
            Descripcion = _Descripcion;
            Cantidad = _Cantidad;
            Lote = _Lote;
            FechaVencimiento = _FechaVencimiento;
            Ubicacion = _Ubicacion;
            Observacion = _Observacion;
        }
 
     public String getCodProv() {
            return CodProv;
        }

    public String getCodCli() {
        return CodCli;
    }
 
     public String getCodSeg() {
            return CodSeg;
        }
     
     public String getFechaIngreso() {
            return FechaIngreso;
        }
     
     public String getCodArt() {
            return CodArt;
        }
        
       public String getLote() {
            return Lote;
        }
       
        public String getDescripcion() {
            return Descripcion;
        }
 
        public int getCantidad() {
            return Cantidad;
        }
        
        public String getFechaVencimiento() {
            return FechaVencimiento;
        }

        public String getUbicacion() {
            return Ubicacion;
        }
        
        public String getObservacion() {
            return Observacion;
        }
 
        public void setCodProv(String _CodProv) {
            this.CodProv = _CodProv;
        }
                
        public void setCodCli(String _CodCli) {
            this.CodCli = _CodCli;
        }

        public void setCodSeg(String _CodSeg) {
            this.CodSeg = _CodSeg;
        }
        
        public void setFechaIngreso(String _FechaIngreso) {
            this.FechaIngreso = _FechaIngreso;
        }     
       
        public void setCodArt(String _CodArt) {
            this.CodArt = _CodArt;
        }
              
        public void setLote(String _Lote) {
            this.Lote = _Lote;
        }
         
        public void setDescripcion(String _Descripcion) {
            this.Descripcion = _Descripcion;
        }
 
        public void setCantidad(int _Cantidad) {
            this.Cantidad = _Cantidad;
        }
    
        public void setFechaVencimiento(String _FechaVencimiento) {
            this.FechaVencimiento = _FechaVencimiento;
        }
        
        public void setUbicacion(String _Ubicacion) {
            this.Ubicacion = _Ubicacion;
        }
        
        public void setObservacion(String _Observacion) {
            this.Observacion = _Observacion;
        }
 
        public ProductosExcel() {
            this.CodProv = CodProv;
            this.CodSeg = CodSeg;
            this.FechaIngreso = FechaIngreso;
            this.CodArt = CodArt;
            this.Lote = Lote;
            this.Descripcion = Descripcion;
            this.Cantidad = Cantidad;
            this.FechaVencimiento=FechaVencimiento;
            this.Ubicacion=Ubicacion;
            this.Observacion = Observacion;
    }
}
