package implementProject_Complete.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import implementProject_Complete.dao.BucketDao;
import implementProject_Complete.dao.impl.BucketDaoImpl;
import implementProject_Complete.domain.Bucket;
import implementProject_Complete.service.BucketService;

public class BucketServiceImpl implements BucketService {

	private static Logger LOG = Logger.getLogger(BucketServiceImpl.class);
	private static BucketService bucketServiceImpl;
	private BucketDao bucketDao;
	
	public BucketServiceImpl() {
		bucketDao = new BucketDaoImpl();
	}
	
	public static BucketService getBucketService() {
		if (bucketServiceImpl == null) {
			bucketServiceImpl = new BucketServiceImpl();
		}

		return bucketServiceImpl;
	}

	@Override
	public Bucket create(Bucket t) {
		return bucketDao.create(t);
	}

	@Override
	public Bucket read(Integer id) {
		return bucketDao.read(id);
	}

	@Override
	public Bucket update(Bucket t) {
		return bucketDao.update(t);
	}

	@Override
	public void delete(Integer id) {
		bucketDao.delete(id);		
	}

	@Override
	public List<Bucket> readAll() {
		return bucketDao.readAll();
	}
}
