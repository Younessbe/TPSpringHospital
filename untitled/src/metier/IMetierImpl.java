package metier;

import dao.IDao;

public class IMetierImpl implements IMetier {
    // couplage faible
    private IDao dao;
    @Override
    public double calcul() {
       double tmp=dao.getData();
       double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
   /*
   injecter dans la variable dao un object d'une
   class qui implemente l'interface idao
    */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
