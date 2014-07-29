package kr.co.docking.service;

import java.util.List;

import kr.co.docking.dao.service.GenericService;
import kr.co.docking.dao.serviceImpl.GenericServiceImpl;
import kr.co.docking.util.JsonParser;
import kr.co.docking.vo.EditorReviewBBSVO;

public class ReviewServiceImpl implements ReviewService {

	@Override
	public Integer reviewAdd(EditorReviewBBSVO editorReview) {
		// TODO Auto-generated method stub
		GenericService<EditorReviewBBSVO>	reviewService = new GenericServiceImpl<EditorReviewBBSVO>();
		reviewService.add("editorReivew_add", editorReview);

		Integer res = 0;
		/*
		 * res �� ó�� �ʿ�
		 */
		return res;
	}

	@Override
	public Integer reviewModify(EditorReviewBBSVO editorReview) {
		// TODO Auto-generated method stub
		GenericService<EditorReviewBBSVO>	reviewService = new GenericServiceImpl<EditorReviewBBSVO>();
		reviewService.modify("editorReview_modify", editorReview);

		Integer res = 0;
		/*
		 * res �� ó�� �ʿ�
		 */
		return res;
	}

	@Override
	public Integer reviewDelete(String reviewId) {
		// TODO Auto-generated method stub
		GenericService<EditorReviewBBSVO>	reviewService = new GenericServiceImpl<EditorReviewBBSVO>();
		reviewService.delete("editorReview_delete", reviewId);

		Integer res = 0;
		/*
		 * res �� ó�� �ʿ�
		 */
		return res;
	}

	@Override
	public String reviewSearch(String reviewId) {
		// TODO Auto-generated method stub
		GenericService<EditorReviewBBSVO>	reviewService = new GenericServiceImpl<EditorReviewBBSVO>();
		EditorReviewBBSVO ervo = reviewService.search("editorReview_search", reviewId);

		String jRes = null;
		JsonParser.getInstance();
		/*
		 * Json Ÿ�� ĳ���� �ʿ�
		 */
		return jRes;
	}

	@Override
	public String reviewList() {
		// TODO Auto-generated method stub
		GenericService<EditorReviewBBSVO>	reviewService = new GenericServiceImpl<EditorReviewBBSVO>();
		List<EditorReviewBBSVO> ervoList = reviewService.searchAll("editorReview_searchAll");
		
		String jRes = null;
		JsonParser.getInstance();
		/*
		 * Json Ÿ�� ĳ���� �ʿ�
		 */
		return jRes;
	}

	@Override
	public String reviewListByEditor(String editorId) {
		// TODO Auto-generated method stub
		GenericService<EditorReviewBBSVO>	reviewService = new GenericServiceImpl<EditorReviewBBSVO>();
		List<EditorReviewBBSVO> ervoList = reviewService.searchAll("editorReview_searchAll_key", editorId);

		String jRes = null;
		JsonParser.getInstance();
		/*
		 * Json Ÿ�� ĳ���� �ʿ�
		 */
		return jRes;
	}

	@Override
	public String reviewListByWriter(String memberId) {
/*		// TODO Auto-generated method stub
		GenericService<EditorReviewBBSVO>	reviewService = new GenericServiceImpl<EditorReviewBBSVO>();
		List<EditorReviewBBSVO> ervoList = reviewService.searchAll("editorReview_searchAll_key", memberId);

		String jRes = null;
		JsonParser.getInstance();
		
		 * Json Ÿ�� ĳ���� �ʿ�
		 
		return jRes;*/
		
		/*
		 * Writer �� ����˻� ���;���.
		 */
		return null;
	}
}