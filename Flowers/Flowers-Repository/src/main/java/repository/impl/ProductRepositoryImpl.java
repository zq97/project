package repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Kind;
import domain.Product;
import domain.Type;
import repository.BaseDao;
import repository.ProductRepository;

public class ProductRepositoryImpl extends BaseDao implements ProductRepository {

	@Override
	public List<Product> hot() {
		List<Product> product = new ArrayList<>();
		ResultSet rs = (ResultSet) super.execute(
				"select p.pid,p.pname,p.pstate,t.tname,p.pinfo,p.pcost,p.psnum,p.prnum,k.kname,p.insertCost\r\n"
						+ "from product p\r\n" + "inner join type t on p.type_tid=t.tid\r\n"
						+ "inner join kind k on p.kind_kid=k.kid where p.pid between 1 and 3\r\n");
		if (rs != null) {
			try {
				while (rs.next()) {
					Type type = new Type(rs.getString(4));
					Kind kind = new Kind(rs.getString(9));
					product.add(new Product(rs.getInt("1"), rs.getString(2), rs.getInt(3), type, rs.getString(5),
							rs.getDouble(6), rs.getInt(7), rs.getInt(8), kind, rs.getDouble(10)));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return product;
	}

	@Override
	public List<Product> findAll() {
		List<Product> product = new ArrayList<>();
		ResultSet rs = (ResultSet) super.execute(
				"select p.pid,p.pname,p.pstate,t.tname,p.pinfo,p.pcost,p.psnum,p.prnum,k.kname,p.insertCost\r\n"
						+ "from product p\r\n" + "inner join type t on p.type_tid=t.tid\r\n"
						+ "inner join kind k on p.kind_kid=k.kid\r\n");
		if (rs != null) {
			try {
				while (rs.next()) {
					Type type = new Type(rs.getString(4));
					Kind kind = new Kind(rs.getString(9));
					product.add(new Product(rs.getInt("1"), rs.getString(2), rs.getInt(3), type, rs.getString(5),
							rs.getDouble(6), rs.getInt(7), rs.getInt(8), kind, rs.getDouble(10)));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return product;
	}

	@Override
	public List<Product> findBypname(String pname) {
		List<Product> product = new ArrayList<>();
		ResultSet rs = (ResultSet) super.execute(
				"select p.pid,p.pname,p.pstate,t.tname,p.pinfo,p.pcost,p.psnum,p.prnum,k.kname,p.insertCost\r\n"
						+ "from product p\r\n" + "inner join type t on p.type_tid=t.tid\r\n"
						+ "inner join kind k on p.kind_kid=k.kid where p.pname like '%?%'\r\n",
				pname);
		if (rs != null) {
			try {
				while (rs.next()) {
					Type type = new Type(rs.getString(4));
					Kind kind = new Kind(rs.getString(9));
					product.add(new Product(rs.getInt("1"), rs.getString(2), rs.getInt(3), type, rs.getString(5),
							rs.getDouble(6), rs.getInt(7), rs.getInt(8), kind, rs.getDouble(10)));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return product;
	}

	@Override
	public void update(Product product) {
		super.execute(
				"update product set pname=?,type=?,pinfo=?,pcost=?,psnum=?,prnum=?,kind=?,insertCost=? where pid=?",
				product.getPname(), product.getType().getTname(), product.getPinfo(), product.getPcost(),
				product.getPsnum(), product.getPrnum(), product.getKind().getKname(), product.getInsertCost(),
				product.getPid());

	}

	@Override
	public void delete(int pid) {
		super.execute("delete from product where pid=?", pid);

	}

}
